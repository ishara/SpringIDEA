package com.springapp.mvc;

import org.springframework.stereotype.Component;

/**
 * Created by ishara on 9/10/13.
 */
@Component
public class TBXServicesImpl implements TBXServices
{
    @Override
    public String welcome()
    {
        return "TBXServicesImpl";
    }
}
