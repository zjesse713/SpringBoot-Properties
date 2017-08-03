package com.example;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:global1.yml")
@ConfigurationProperties
public class GlobalProperties {

    private String prodpostfix;
    private String ulapostfix;

    public String getProdpostfix() {
		return prodpostfix;
	}


	public void setProdpostfix(String prodpostfix) {
		this.prodpostfix = prodpostfix;
	}


	public String getUlapostfix() {
		return ulapostfix;
	}


	public void setUlapostfix(String ulapostfix) {
		this.ulapostfix = ulapostfix;
	}


	@Override
    public String toString() {
        return "GlobalProperties{" +
                "Production=" + prodpostfix +
                ", Lower Env='" + ulapostfix + '\'' +
                '}';
    }
}
