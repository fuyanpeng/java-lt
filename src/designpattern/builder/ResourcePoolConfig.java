package designpattern.builder;


import com.sun.xml.internal.ws.util.StringUtils;

public class ResourcePoolConfig {
    private String name;
    private int MaxTotal;
    private int MaxIdle;
    private int MinIdle;

    private ResourcePoolConfig(Builder builder){
        this.name = builder.name;
        this.MaxTotal = builder.maxTotal;
        this.MaxIdle = builder.maxIdle;
        this.MinIdle = builder.minIdle;
    }


    private static class Builder {
        private static final int DEFAULT_MAX_TOTAL = 0;
        private static final int DEFAULT_MAX_IDLE = 8;
        private static final int DEFAULT_MIN_IDLE = 0;

        private String name;
        private int maxTotal = DEFAULT_MAX_TOTAL;
        private int maxIdle = DEFAULT_MAX_IDLE;
        private int minIdle = DEFAULT_MIN_IDLE;

        public ResourcePoolConfig builder(){
            if ("".equals(name)){
                throw new IllegalArgumentException("xxx name");
            }
            if (maxIdle > maxTotal) {
                throw new IllegalArgumentException("xxx xxx");
            }

            return new ResourcePoolConfig(this);
        }

        public Builder setName(String name){
            if("".equals(name)){;
                throw new IllegalArgumentException("xxx");
            }
            this.name = name;
            return this;
        }
        public Builder setMaxIdle(int num){
            this.maxIdle = num;
            return this;
        }
        public Builder setMaxTotal(int num){
            this.maxTotal = num;
            return this;
        }
        public Builder setMinIdle(int num){
            this.minIdle = num;
            return this;
        }

    }
}

//ResourcePoolConfig config = new ResourcePoolConfig.Builder()
//        .setName("xxx")
//        .setMaxTotal(10)
//        .setMaxIdle(9)
//        .setMinIdle(8)
//        .builder();

