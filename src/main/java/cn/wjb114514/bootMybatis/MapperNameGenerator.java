package cn.wjb114514.bootMybatis;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanNameGenerator;
import org.springframework.util.ClassUtils;

import java.beans.Introspector;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @author wjb
 * @date 2022/10/29 14:43 周六
 */
public class MapperNameGenerator implements BeanNameGenerator {

    Map<String, Integer> beanNameCountMap = new HashMap<>();

    @Override
    public String generateBeanName(BeanDefinition beanDefinition, BeanDefinitionRegistry beanDefinitionRegistry) {
        String shortClassName = ClassUtils.getShortName(Objects.requireNonNull(beanDefinition.getBeanClassName()));
        // 简单类名首字母小写作为beanName
        String beanName = Introspector.decapitalize(shortClassName);
        if (beanNameCountMap.containsKey(beanName)) {
            // 如果出现过，我们把beanName修改为 beanName+出现次数
            int index = beanNameCountMap.get(beanName) + 1;
            beanNameCountMap.put(beanName, index);
            beanName += index;
        } else {
            beanNameCountMap.put(beanName, 1);
        }
        return beanName;
    }
}
