package hello.core4.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class NetworkClient {

    private String url;

    public NetworkClient() {
        System.out.println("생성자 호출 : " + url);
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void connect(){
        System.out.println("connect : " + url);
    }

    public void call(){
        System.out.println("call: " + url);
    }

    public void disconnect(){
        System.out.println("disconnect: " + url);
    }

    @PostConstruct
    public void init() {
        connect();
        call();
    }

    @PreDestroy
    public void close() {
        disconnect();
    }
}
