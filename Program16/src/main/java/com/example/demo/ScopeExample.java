package com.example.demo;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class ScopeExample { }
