package dayTwelve.innerClasses;

public class Innerclasses {
    public static void main(String[] args) {
        Outside obj = new Outside();
        obj.show();

/*         Outside.Inside obj1 = obj.new Inside(); NON STATIC CLASS ONLY */
        Outside.Inside obj1 = new Outside.Inside(); 
        obj1.config();
    }
}


class Outside {
    public void show() 
    {
        System.out.println("In show()");
    }

    static class Inside // static can be used only for inner class
    {
        public void config()
        {
            System.out.println("In config()");
        }
    }
}