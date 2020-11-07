package com.fushaolei.android_retrofit_demo;

public class Translation {
    private int status;

    private Content content;
    private static class Content{
        private String from;
        private String to;
        private String vendor;
        private String out;
        private int errNo;

        public String getFrom() {
            return from;
        }

        public void setFrom(String from) {
            this.from = from;
        }

        public String getTo() {
            return to;
        }

        public void setTo(String to) {
            this.to = to;
        }

        public String getVendor() {
            return vendor;
        }

        public void setVendor(String vendor) {
            this.vendor = vendor;
        }

        public String getOut() {
            return out;
        }

        public void setOut(String out) {
            this.out = out;
        }

        public int getErrNo() {
            return errNo;
        }

        public void setErrNo(int errNo) {
            this.errNo = errNo;
        }
    }

    public void show(){
        System.out.println(status);

        System.out.println(content.from);
        System.out.println(content.to);
        System.out.println(content.vendor);
        System.out.println(content.out);
        System.out.println(content.errNo);
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Content getContent() {
        return content;
    }

    public void setContent(Content content) {
        this.content = content;
    }
}
