package com.loyalty.topic1.serviceImpl;

import com.loyalty.topic1.model.LogicModel;
import com.loyalty.topic1.repository.LogicRepository;
import com.loyalty.topic1.request.LogicRequest;
import com.loyalty.topic1.response.ApiResponse;
import com.loyalty.topic1.service.LogicService;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class LogicServiceImpl implements LogicService {

    @Autowired
    private LogicRepository logicRepository;
    @Override
    public ResponseEntity<ApiResponse<Object>> addLogic(LogicRequest logicRequest)
    {
        LogicModel newLogic = LogicModel.builder().logic_name(logicRequest.getLogic_name()).description(logicRequest.getDescription()).notation(logicRequest.getNotation()).created_time(logicRequest.getCreated_date()).created_by(logicRequest.getCreated_by()).build();
//        KieContainer kieContainer = KieServices.get().newKieClasspathContainer();
//        KieSession session =kieContainer.newKieSession("label");
//        session.insert(newLogic);
//        session.fireAllRules();
//        if(newLogic.getNotation() == null)
//        {
//            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ApiResponse.builder().message("Notation không thể là >").build());
//        }
        logicRepository.save(newLogic);
        return ResponseEntity.status(HttpStatus.CREATED).body(ApiResponse.builder().message("Thêm logic thành công").data(newLogic).build());
    }

}
