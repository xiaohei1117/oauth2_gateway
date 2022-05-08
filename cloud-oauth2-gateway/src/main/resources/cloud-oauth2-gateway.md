gateway进行统一鉴权

### 第一步:
编写Config这个包的类
```java
/**
 * 网关白名单配置
 * Created by macro on 2020/6/17.
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Component
//通过配置文件来获取到白名单
@ConfigurationProperties(prefix="secure.ignore")
public class IgnoreUrlsConfig {
    private List<String> urls;
}
```

### 第二步: 
>路由匹配到就会走AuthorizationManager这个类

>随后就到IgnoreUrlsRemoveJwtFilter这个类来进行拦截

>在到AuthGlobalFilter来进行拦截,

    