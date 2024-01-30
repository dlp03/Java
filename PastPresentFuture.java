Scanner in = new Scanner(System.in);
        System.out.println("Enter month: ");
        int month = in.nextInt();
        System.out.println("Enter day: ");
        int day = in.nextInt();
        System.out.println("Enter year: ");
        int year = in.nextInt();

        LocalDateTime now = LocalDateTime.now();
        int currentYear = now.getYear();
        int currentMonth = now.getMonthValue();
        int currentDay = now.getDayOfMonth();

        if (year != currentYear) {
            System.out.println(year + " is not this year");
        } else {
            if(month < currentMonth) {
                System.out.println(month + " was a month earlier this year");
            } else if(month > currentMonth) {
                System.out.println(month + " is a month later this year");
            } else {
                System.out.println(month + " is this month");
            }
        }
    }
}