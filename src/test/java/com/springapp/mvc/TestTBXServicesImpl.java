package com.springapp.mvc;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
* Created by ishara on 9/10/13.
*/
@Primary
@Component
public class TestTBXServicesImpl implements TBXServices
{
    @Override
    public String welcome()
    {
        return "TestTBXServicesImpl";
    }
}
