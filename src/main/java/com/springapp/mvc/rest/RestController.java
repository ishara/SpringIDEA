package com.springapp.mvc.rest;

import com.springapp.mvc.TBXServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.logging.Logger;

/**
 * Created by ishara on 9/10/13.
 */
@Controller
@RequestMapping(value = "/REST")
public class RestController
{
    public int count = 0;
    private static final Logger LOGGER = Logger.getLogger( RestController.class.getName() );
    TBXServices tbxServices ;

    @Autowired
    public RestController(TBXServices tbxServices)
    {
        this.tbxServices = tbxServices;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String printWelcome(ModelMap model)
    {
        model.addAttribute( "message", "Hello world!" );
        System.out.println( "tbxServices = " + tbxServices.welcome() );
        return "hello";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{gameId}", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.TEXT_XML_VALUE})
    ResponseEntity<String> showGame(@PathVariable Long gameId)
    {

        LOGGER.info( "" + count );
        System.out.println( "tbxServices = " + tbxServices.welcome() );
        return new ResponseEntity<String>( String.format( "This is Game '%d'", ++count ), HttpStatus.OK );
    }
}
