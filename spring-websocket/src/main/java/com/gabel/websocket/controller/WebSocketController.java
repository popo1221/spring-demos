//package com.gabel.websocket.controller;
//
//import java.util.Map;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.messaging.handler.annotation.MessageMapping;
//import org.springframework.messaging.handler.annotation.Payload;
//import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
//import org.springframework.messaging.simp.SimpMessageSendingOperations;
//import org.springframework.stereotype.Controller;
//
//import com.google.gson.Gson;
//
//@Controller
//public class WebSocketController {
//
//	@Autowired
//	private SimpMessageSendingOperations messagingTemplate;
//	
//	@MessageMapping("/message")
//    public void processMessageFromClient(@Payload String message, SimpMessageHeaderAccessor  headerAccessor) throws Exception {
//		String sessionId = headerAccessor.getSessionAttributes().get("sessionId").toString();
//		System.out.println(sessionId);
//		headerAccessor.setSessionId(sessionId);
//		messagingTemplate.convertAndSend("/topic/reply", new Gson().fromJson(message, Map.class).get("name"));
//      
//    }
//	
//}
