package user;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.cglib.proxy.Factory;
import org.springframework.stereotype.Component;

@Component
public class UserFactory implements FactoryBean<User> {
    @Override
    public User getObject(){
        return new User();
    }

    @Override
    public Class<?> getObjectType() {
        return User.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
