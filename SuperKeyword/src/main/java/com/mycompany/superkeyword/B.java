
package com.mycompany.superkeyword;


public class B extends A{
    int x=5;
    
    @Override
    void dis()
    {
        super.dis();
        System.out.println(super.x);
        System.out.println(y);
    }
    
}
