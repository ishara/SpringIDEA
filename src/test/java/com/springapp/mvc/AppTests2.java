package com.springapp.mvc;

import com.springapp.mvc.rest.RestController;
import org.junit.Before;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.mock;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

public class AppTests2
{
    private MockMvc mockMvc;
    private TBXServices tbxServices = mock( TestTBXServicesImpl.class );

    @Before
    public void setup()
    {
        this.mockMvc = standaloneSetup( new RestController( tbxServices ) ).build();
    }

    @Test
    public void simple() throws Exception {
        mockMvc.perform(get("/REST/1"))
                .andExpect(status().isOk());
        mockMvc.perform( get( "/REST/2" ) )
                .andExpect(status().isOk());

    }
}
