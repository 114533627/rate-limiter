package cn.caijiajia.ratelimiter.server.vo;

public class SimpleResponseVo {
    public SimpleResponseVo() {
    }

    public SimpleResponseVo(Object content) {
        this.content = content;
    }

    private Object content;

    public Object getContent() {
        return content;
    }

    public void setContent(Object content) {
        this.content = content;
    }
}
