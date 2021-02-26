package Module11;

@FunctionalInterface
interface Met<T, U, R> {
    static int refm(int x, int y) {
        return (x * y) * 2;
    }

    R apply(T t, U u);
}
