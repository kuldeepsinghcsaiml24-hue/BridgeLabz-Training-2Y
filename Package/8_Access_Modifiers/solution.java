// com/access/one/Base.java
package com.access.one;
public class Base{
    public void pub(){System.out.println("public");}
    protected void pro(){System.out.println("protected");}
    void def(){System.out.println("default");}
    private void pri(){System.out.println("private");}
}

// com/access/two/Derived.java
package com.access.two;
import com.access.one.Base;
public class Derived extends Base{
    public void test(){
        pub();
        pro(); // allowed
        // def(); // not allowed outside package
        // pri(); // never allowed
    }
}

// MainApp.java
import com.access.two.Derived;
public class MainApp{
    public static void main(String[] args){
        new Derived().test();
    }
}