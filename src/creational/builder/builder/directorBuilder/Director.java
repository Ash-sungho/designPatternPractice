package creational.builder.builder.directorBuilder;

// 각 문자열 포맷 빌드 과정을 템플릿화 시킨 디렉터
public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public String build() {
        StringBuilder sb = new StringBuilder();

        sb.append(builder.head());
        sb.append(builder.body());
        sb.append(builder.foot());

        return sb.toString();
    }


}
