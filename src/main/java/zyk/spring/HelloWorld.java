package zyk.spring;


class HelloWorld {
    private String message;

    public String getMessage() {
        System.out.printf("Your message %s\n", message);
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void test() {
        System.out.printf("this is a test function");
    }

    public void init() {
        System.out.println("init ok");
    }

    public void destory() {
        System.out.println("destory ok");
    }
}
