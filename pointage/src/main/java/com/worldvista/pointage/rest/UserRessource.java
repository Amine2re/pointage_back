package com.worldvista.pointage.rest;

import net.minidev.json.JSONObject;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/user/")
//@Log4j
public class UserRessource {

//    private SmsService smsService;
//
//    public UserRessource(SmsService smsService) {
//        this.smsService = smsService;
//    }

    @GetMapping("employes")
    public ResponseEntity<JSONObject> listEmploye(){
        var obj = new JSONObject();
        obj.put("1","Mouhamadou Toure");
        obj.put("2","Junior Gato");
        obj.put("3","Lamine Faty");
        System.out.println("listEmp ____" + obj);
        return  ResponseEntity.ok().body(obj);
    }

    @GetMapping("welcome")
    public ResponseEntity<String> welcom(){
        var welcomTxt = new ArrayList<>();
        welcomTxt.add("Youre welcome Amine Toure");
        return  ResponseEntity.ok().body(welcomTxt.toString());
    }

//    @PostMapping("/sendSms")
//    public ResponseEntity<Object> sendMessage(@RequestBody SmsRequest smsRequest){
//        public ResponseEntity<Object> sendMessage(@RequestBody SmsRequest smsRequest){
//        var message = smsService.sendSms(smsRequest);
//        if("sent".equals(message.getStatus()) || "queued".equals(message.getStatus())){
//            return new  ResponseEntity<Object>("Envoi reussi",HttpStatus.OK);
//        }else {
//            return new  ResponseEntity<Object>("Echec de l'envoi",HttpStatus.NOT_FOUND);
//        }
//    }
}
