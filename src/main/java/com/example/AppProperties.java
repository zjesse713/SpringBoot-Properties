package com.example;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@PropertySource("classpath:application.yml.bk")
@ConfigurationProperties("app")
public class AppProperties {

    private String[] ports;
    private List<Site> site = new ArrayList<>();

    public static class Site {
        private String maxServers;
        private String hostName;
        private String title;

        

        public String getMaxServers() {
			return maxServers;
		}



		public void setMaxServers(String maxServers) {
			this.maxServers = maxServers;
		}



		public String getHostName() {
			return hostName;
		}



		public void setHostName(String hostName) {
			this.hostName = hostName;
		}



		public String getTitle() {
			return title;
		}



		public void setTitle(String title) {
			this.title = title;
		}



		@Override
        public String toString() {
            return "Menu{" +
                    "name='" + hostName + '\'' +
                    ", path='" + maxServers + '\'' +
                    ", title='" + title + '\'' +
                    '}';
        }
    }

    public static class Compiler {
        private String timeout;
        private String outputFolder;

        public String getTimeout() {
            return timeout;
        }

        public void setTimeout(String timeout) {
            this.timeout = timeout;
        }

        public String getOutputFolder() {
            return outputFolder;
        }

        public void setOutputFolder(String outputFolder) {
            this.outputFolder = outputFolder;
        }

        @Override
        public String toString() {
            return "Compiler{" +
                    "timeout='" + timeout + '\'' +
                    ", outputFolder='" + outputFolder + '\'' +
                    '}';
        }

    }

    

    public String[] getPorts() {
		return ports;
	}



	public void setPorts(String[] ports) {
		this.ports = ports;
	}



	public List<Site> getSite() {
		return site;
	}



	public void setSite(List<Site> site) {
		this.site = site;
	}



	@Override
    public String toString() {
        return "AppProperties{" +
                "site='" + site + '\'' +
                ", site=" + ports[4] +
                ", compiler=" + site +
                '}';
    }
}
