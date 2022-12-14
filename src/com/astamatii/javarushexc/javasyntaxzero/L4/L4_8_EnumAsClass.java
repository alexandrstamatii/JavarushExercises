package com.astamatii.javarushexc.javasyntaxzero.L4;

public class L4_8_EnumAsClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Month jan = Month.JANUARY;

		Month[] months = Month.values();

		System.out.println(jan);
		System.out.println(months[1]);
		System.out.println(jan.ordinal());
		System.out.println(months[1].ordinal());

	}

	static class Month {
		public static final Month JANUARY = new Month(0);
		public static final Month FEBRUARY = new Month(1);
		public static final Month MARCH = new Month(2);
		public static final Month APRIL = new Month(3);
		public static final Month MAY = new Month(4);
		public static final Month JUNE = new Month(5);
		public static final Month JULY = new Month(6);
		public static final Month AUGUST = new Month(7);
		public static final Month SEPTEMBER = new Month(8);
		public static final Month OCTOBER = new Month(9);
		public static final Month NOVEMBER = new Month(10);
		public static final Month DECEMBER = new Month(11);

		private final int value;

		private static final Month[] values = { JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER,
				OCTOBER, NOVEMBER, DECEMBER };

		private Month(int value) {
			this.value = value;
		}

		public static Month[] values() {
			return values;
		}

		public int ordinal() {
			return this.value;
		}
	}

}
