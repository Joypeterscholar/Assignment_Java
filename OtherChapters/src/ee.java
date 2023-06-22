import org.junit.jupiter.api.extension.ExtensionContext;

import java.util.Random;

public class ee {
        private static ExtensionContext.Namespace builder;
        private static Random random;

        public static String main(String[] args) {
            for (int i = 0; i < 10; i++) {
                int generated;
                generated = random.nextInt(0, 10);
                builder.append(generated);
            }
            return builder.toString();
        }
    }

