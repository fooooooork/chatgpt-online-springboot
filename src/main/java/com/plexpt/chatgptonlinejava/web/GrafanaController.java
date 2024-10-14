package com.plexpt.chatgptonlinejava.web;


import com.plexpt.chatgpt.ChatGPT;
import com.plexpt.chatgpt.ChatGPTStream;
import com.plexpt.chatgpt.entity.chat.ChatCompletion;
import com.plexpt.chatgpt.entity.chat.ChatCompletionResponse;
import com.plexpt.chatgpt.entity.chat.Message;
import com.plexpt.chatgptonlinejava.app.ChatParam;
import com.plexpt.chatgptonlinejava.app.GPTEventSourceListener;
import com.plexpt.chatgptonlinejava.app.KeyManager;
import com.plexpt.chatgptonlinejava.web.req.TestReq;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
@RestController
@RequestMapping("/grafana")
@RequiredArgsConstructor
public class GrafanaController {

    @PostMapping("/test")
    public TestReq chat(@RequestBody TestReq req) {
        return req;
    }

}
