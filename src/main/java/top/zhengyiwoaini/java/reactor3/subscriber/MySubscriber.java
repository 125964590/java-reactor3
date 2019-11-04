package top.zhengyiwoaini.java.reactor3.subscriber;

import org.reactivestreams.Subscription;
import reactor.core.publisher.BaseSubscriber;

/**
 * @author jbzm
 * @date 2019-09-09 18:31
 **/
public class MySubscriber<T> extends BaseSubscriber<T> {
    @Override
    protected void hookOnSubscribe(Subscription subscription) {
        request(1);
    }
}