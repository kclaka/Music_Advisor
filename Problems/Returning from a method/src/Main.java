class Create {

    public static Runnable createRunnable(String text, int repeats) {

        return new Runnable() {
            @Override
            public void run() {
                int i = repeats;
                while (i > 0) {
                    System.out.println(text);
                    i--;
                }
            }
        };
    }
}