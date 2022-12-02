package com.bridgeLabz;

import static org.junit.Assert.assertEquals;
import junit.framework.Assert;
import org.junit.Test;



public class TestCase extends UserRegistrationForm{

    @Test
    public void NameTest(){
        Assert.assertEquals(true, checkFirstName("Saurav") );
    }

    @Test
    public void LastNameTest(){
        Assert.assertEquals(true, checkLastName("Raj") );
    }
    @Test
    public void EmailTest(){
        Assert.assertEquals(true, checkEmailAddress("saurav.raj4986@gmail.com") );
    }
    @Test
    public void PhoneTest(){
        Assert.assertEquals(true, checkMobileNumber("+91 9337564989") );
    }
    @Test
    public void PasswordTest(){
        Assert.assertEquals(true, checkPassword("01@Lbcdefgh") );
    }

}
