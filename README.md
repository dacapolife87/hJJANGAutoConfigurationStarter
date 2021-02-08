# hJJANGAutoConfigurationStarter

1. 사용할 곳에서 의존성을 추가한다.

<pre>
    <groupId>me.hjjang</groupId>
    <artifactId>hjjang-spring-boot-starter</artifactId>
    <version>1.0-SNAPSHOT</version>
</pre>

2. properties값에 값이 셋팅될 경우 해당값으로 주입이 된다.

<pre>
holoman.name = hjjang
holoman.how-long = 100
</pre>

2.1 만약 해당 값이 없을 경우 스타터에 만든 값으로 값이 셋팅된다.
