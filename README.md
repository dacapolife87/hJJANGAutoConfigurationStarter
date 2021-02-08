# hJJANGAutoConfigurationStarter

1. 사용할 곳에서 의존성을 추가한다.

<pre>
 &lt;dependency&gt;
     &lt;groupId&gt;me.hjjang&lt;/groupId&gt;
     &lt;artifactId&gt;hjjang-spring-boot-starter&lt;/artifactId&gt;
     &lt;version&gt;1.0-SNAPSHOT&lt;/version&gt;
 &lt;/dependency&gt;
</pre>


2. properties값에 값이 셋팅될 경우 해당값으로 주입이 된다.

<pre>
holoman.name = hjjang
holoman.how-long = 100
</pre>

2.1 만약 해당 값이 없을 경우 스타터에 만든 값으로 값이 셋팅된다.
