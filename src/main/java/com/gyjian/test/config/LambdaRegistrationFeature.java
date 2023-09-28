package com.gyjian.test.config;

import org.graalvm.nativeimage.hosted.Feature;
import org.graalvm.nativeimage.hosted.RuntimeSerialization;

import java.util.List;

/**
 * lambda 表达式注入到graal中
 * @author ztp
 * @date 2023/8/18 11:53
 */
public class LambdaRegistrationFeature implements Feature {


    @Override
    public void duringSetup(Feature.DuringSetupAccess access) {
        // 手工注入使用了 lambda 表达式的类
        //RuntimeSerialization.registerLambdaCapturingClass(TestController.class);

        //参数是父包, 会扫描有写 @GraalReflectionAotHints 的类，批量注入
        List<Class<?>> graalAotHints = AotUtils.getGraalAotHints(List.of("com.gyjian.test"));
        graalAotHints.forEach(RuntimeSerialization::registerLambdaCapturingClass);
    }
}