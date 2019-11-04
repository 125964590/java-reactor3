package top.zhengyiwoaini.java.reactor3;

import org.junit.Test;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Arrays;
import java.util.List;

/**
 * @author jbzm
 * @date 2019-09-09 18:03
 */
public class HelloWorld {
  @Test
  public void test01() {
    Flux<String> just = Flux.just("jbzm", "lol", "haha");
    List<String> strings = Arrays.asList("jbzm", "lol", "haha");
    Flux<String> stringFlux = Flux.fromIterable(strings);

    Mono<Object> empty = Mono.empty();
    Mono<String> lol = Mono.just("lol");
    Flux<Integer> range = Flux.range(2, 3);

    range.subscribe();
    range.subscribe(System.out::println);
    range
        .map(
            element -> {
              if (element > 4) {
                throw new IllegalArgumentException("error element:" + element);
              }
              return element;
            })
        .subscribe(
            System.out::println, Throwable::printStackTrace, () -> System.out.println("done"));
  }
}
