package com.loyalty.identity_customer.serviceImpl;

import com.loyalty.identity_customer.model.GroupModel;
import com.loyalty.identity_customer.repository.CustomerAttributeRepository;
import com.loyalty.identity_customer.repository.GroupRepository;
import com.loyalty.identity_customer.response.ApiResponse;
import com.loyalty.identity_customer.response.CustomerAttributeResponse;
import com.loyalty.identity_customer.service.GroupService;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupServiceImpl implements GroupService {

    @Autowired
    private GroupRepository groupRepository;

    @Autowired
    private CustomerAttributeRepository customerAttributeRepository;
    @Override
    public ResponseEntity<ApiResponse<Object>> getGroupById(Long idLogic)
    {
        return ResponseEntity.status(HttpStatus.OK).body(ApiResponse.builder().message("Lấy logic theo id").data(groupRepository.findById(idLogic)).build());
    }

    @Override
    public ResponseEntity<ApiResponse<Object>> getAllGroup()
    {
        System.out.println(groupRepository.getAllGroup().size());
        return ResponseEntity.status(HttpStatus.OK).body(ApiResponse.builder().message("Tất cả group").data(groupRepository.getAllGroup()).build());
    }

    @Override
    public ResponseEntity<ApiResponse<Object>> getListGroupByIdLabel(Long idLabel) {
        List<GroupModel> listGroupByIdLabel = groupRepository.getListGroupByIdLabel(idLabel);
        return ResponseEntity.status(HttpStatus.OK).body(ApiResponse.builder().message("Danh sách group theo id label").data(listGroupByIdLabel).build());
    }

    @Override
    public ResponseEntity<ApiResponse<Object>> getListGroupByLabelId(Long idLabel) {
        return ResponseEntity.status(HttpStatus.OK).body(ApiResponse.builder().message("Danh sách group theo label id").data(groupRepository.getListGroupByLabelId(idLabel)).build());
    }

    @Override
    public ResponseEntity<ApiResponse<Object>> getListGroupWithConditionNotNull() {
        return ResponseEntity.status(HttpStatus.OK).body(ApiResponse.builder().message("Danh sách group có condition").data(groupRepository.getListGroupWithConditionNotNull()).build());
    }

//    boolean checkCondition(String customerAttributeValue, OperatorModel operatorModel, String conditionValue)
//    {
//        double customerAttributeValueDouble = Double.parseDouble(customerAttributeValue);
//        double conditionValueDouble = Double.parseDouble(conditionValue);
//
//        return switch (operatorModel.getNotation()) {
//            case ">" -> customerAttributeValueDouble > conditionValueDouble;
//            case "<" -> customerAttributeValueDouble < conditionValueDouble;
//            case "=" -> customerAttributeValueDouble == conditionValueDouble;
//            case ">=" -> customerAttributeValueDouble >= conditionValueDouble;
//            case "<=" -> customerAttributeValueDouble <= conditionValueDouble;
//            default -> false;
//        };
//    }


    @Override
    public ResponseEntity<String> checkCondition()
    {
        long startTime = System.currentTimeMillis();
        List<GroupModel> groupModels = groupRepository.getListGroupWithConditionNotNull();
        List<CustomerAttributeResponse> customerAttributeModels = customerAttributeRepository.getAllCustomerAttribute();
        //List<CustomerAttributeModel> customerAttributeModels = customerAttributeRepository.findAll();
        long endTime = System.currentTimeMillis();

        // Tính thời gian chạy
        long executionTime = endTime - startTime;
        System.out.println("Thời gian đọc db: " + executionTime + " milliseconds");
        KieContainer kieContainer = KieServices.get().newKieClasspathContainer();
        KieSession session = kieContainer.newKieSession("label");
        for (CustomerAttributeResponse customerAttribute : customerAttributeModels) {
            session.insert(customerAttribute);
        }
        for (GroupModel group : groupModels) {
            session.insert(group);
        }
        session.fireAllRules();
        session.dispose();
        // Kết thúc đo thời gian
        return ResponseEntity.status(HttpStatus.OK).body("đã chạy");
    }

}
