package cn.itcast.momo_chat.service;

import cn.itcast.momo_chat.entity.Msg;
import cn.itcast.momo_chat.service.impl.HBaseNativeChatMessageService;
import cn.itcast.momo_chat.service.impl.PhoenixChatMessageService;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class ChatMessageServiceTest {
    private ChatMessageService chatMessageService;

    public ChatMessageServiceTest() throws Exception {
//        chatMessageService = new HBaseNativeChatMessageService();
        chatMessageService = new PhoenixChatMessageService();
    }

    @Test
    public void getMesage() throws Exception {
        List<Msg> message = chatMessageService.getMessage("2022-01-29", "13514684105", "13647128512");
        for (Msg msg : message) {
            System.out.println(msg);
        }
    }
}

