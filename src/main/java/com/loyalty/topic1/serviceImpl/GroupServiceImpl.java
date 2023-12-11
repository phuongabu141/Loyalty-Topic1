package com.loyalty.topic1.serviceImpl;

import com.loyalty.topic1.model.AttributeModel;
import com.loyalty.topic1.model.CustomerAttributeModel;
import com.loyalty.topic1.model.GroupModel;
import com.loyalty.topic1.model.OperatorModel;
import com.loyalty.topic1.repository.CustomerAttributeRepository;
import com.loyalty.topic1.repository.GroupRepository;
import com.loyalty.topic1.response.ApiResponse;
import com.loyalty.topic1.service.GroupService;
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
    public ResponseEntity<ApiResponse<Object>> getLogicById(Long idLogic)
    {
        return ResponseEntity.status(HttpStatus.OK).body(ApiResponse.builder().message("Lấy logic theo id").data(groupRepository.findById(idLogic)).build());
    }

    @Override
    public ApiResponse<Object> getAllLogic()
    {
        return ApiResponse.builder().data(groupRepository.findAll()).build();
    }

    @Override
    public ResponseEntity<ApiResponse<Object>> getListGroupByIdLabel(Long idLabel) {
        List<GroupModel> listGroupByIdLabel = groupRepository.getListGroupByIdLabel(idLabel);
        return ResponseEntity.status(HttpStatus.OK).body(ApiResponse.builder().message("Danh sách group theo id label").data(listGroupByIdLabel).build());
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
        KieContainer kieContainer = KieServices.get().newKieClasspathContainer();
        KieSession session =kieContainer.newKieSession("label");
        List<GroupModel> groupModels = groupRepository.getListGroupWithConditionNotNull();
        List<CustomerAttributeModel> customerAttributeModels = customerAttributeRepository.findAll();
        for (CustomerAttributeModel customerAttribute : customerAttributeModels) {
            session.insert(customerAttribute);
        }
        for (GroupModel group : groupModels) {
            session.insert(group);
        }
        session.fireAllRules();
        session.dispose();
        return ResponseEntity.status(HttpStatus.OK).body("đã chạy");
    }

}
