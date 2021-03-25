package com.juno.board.service;

import com.juno.board.dto.ReplyDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class ReplyServiceTests {

    @Autowired
    private ReplyService service;

    @Test
    public void testGetList() {
        Long bno = 100L; // is in DB

        List<ReplyDTO> replyDTOList = service.getList(bno);

        replyDTOList.forEach(r -> System.out.println(r));
    }
}