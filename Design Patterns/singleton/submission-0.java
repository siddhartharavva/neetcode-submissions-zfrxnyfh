static class Singleton {

    private static volatile Singleton  uni= null;
    private String val = null;
    private Singleton() {

    }

    public static Singleton getInstance() {
        if(uni==null){
            uni = new Singleton();
        }
        return uni;
    }

    public String getValue() {
        return val;
    }

    public void setValue(String value) {
        val = value;
        System.out.println("Value changed to "+val);
    }
    
}
