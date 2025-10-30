package com.example.cyberdemo;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class CyberControllerTest {


    @Autowired
    private MockMvc mockMvc;

    @Test
    void testIndexPage() throws Exception {
        mockMvc.perform(get("/"))
            .andExpect(status().isOk());
    }
}