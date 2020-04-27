package day25_MethodsRecap;
/*
Warm up tasks:
	1. write a return method named getDriver1 that accepts a string parameter called Browser
			if the browser name matches with {"chrome", "firefox", "safari", "edge", "Opera"}, then it returns the name of that specific browser' driver
				Ex: getDriver("chrome");  ==> "Chrome Driver"
					getDriver("fireFOX"); ==> "FireFox Driver"
						....
			if the browser name does not match with any of browsers above, the method should return "Invalid"
			APPLY SWITCH STATEMENTS
	2. do the first task with multi-branch if statement instead of switch statement
	3. do the first task with ternaries instead of switch statements
 */
public class Driver {
/*
/*
method decleration:
		Access-modifers  Specifier  return-Type  MethodName(paramter){
				statements;
		}
 */
    public static void main(String[] args) {
        //getDriver1();//calling a method //argument is mandatory in ()
        String str = getDriver1("Cybertek");//you can print but can only use it once
        //System.out.println(str);

        String str2 = getDriver2("chRoMe");

        System.out.println(str2);

        String str3 = getDriver3("FireFox");

        System.out.println(str3);
    }

    public static String getDriver1(String browserName){
        //String arr[] = {"chrome", "firefox"} if you use array hav to apply loop easier to use String
        String result = "";

        switch (browserName.toLowerCase()){//"ChromE".toLowerCase() ==> chrome
            case "chrome": result = "Chrome Driver";//use return instead of result
                            break;// no need for break in this case
            case "firefox": result = "Firefox Driver";
                            break;
            case "safari": result = "Safari Driver";
                            break;
            case "opera": result = "Opera Driver";
                            break;
            case "edge": result = "Edge Driver";
                            break;
            default: result = "Invalid Driver";

        }
        //System.out.println(result); //its unneccesary
        return result;//can use print method but the point is to return value
    }

    public static String getDriver2(String browserName){
        browserName = browserName.toLowerCase();//ignore case sensitivity
        String result = "";
        if(result.equals("chrome")){
            result = "Chrome Driver";//return "Chrome Driver" is shorter way to use

        }else if(browserName.equals("firefox")){
            result = "Firefox Driver";
        }else if(browserName.equals("Safari")){
            result = "Safari";
        }else if(browserName.equals("Opera")){
            result = "Opera Driver";
        }else if(browserName.equals("Edge")){
            result = "Edge Driver";
        }else if(browserName.equals("Opera")){
            result = "Opera Driver";
        }else{
            result = "Invalid Driver";
        }

        return result; //needs to be whatever we assign to result
        //if we use return instead of result we don't need this return result
        //return can be applied in switch statement but no break is needed and no need to use String result


    }

    public static String getDriver3(String browserName){
        browserName = browserName.toLowerCase();
        String result = (browserName.equals("chrome")) ? "Chrome Driver"//instead of String result can use return
                : (browserName.equals("firefox")) ? "Firefox Driver"
                : (browserName.equals("safari")) ? "Safari Driver"
                : (browserName.equals("edge")) ? "Edge Driver"
                : (browserName.equals("opera")) ? "Opera Driver"
                : "Invalid Driver";

        return result;
    }
}
