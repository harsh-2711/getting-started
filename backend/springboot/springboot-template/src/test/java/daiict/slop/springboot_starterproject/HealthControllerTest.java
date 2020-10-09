package daiict.slop.springboot_starterproject;

import daiict.slop.springboot_starterproject.controller.HealthController;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * HealthController Tester.
 * @version 1.0
 * @since Oct 2, 2020
 */
@RunWith(SpringJUnit4ClassRunner.class)
public class HealthControllerTest {
    private MockMvc mockMvc;
    @InjectMocks
    private HealthController healthController;

    @Before
    public void setUp() throws Exception {
        mockMvc = MockMvcBuilders.standaloneSetup(healthController)
                .build();
    }

    /**
     * TestCase for Health API
     *
     * @throws Exception
     */
    @Test
    public void testHeathAPI() throws Exception {
        mockMvc.perform(get("/health"))
                .andExpect(status().isOk())
                .andExpect(content().string("project working correctly"));
    }
}