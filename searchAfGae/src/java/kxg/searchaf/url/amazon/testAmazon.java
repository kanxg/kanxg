package kxg.searchaf.url.amazon;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class testAmazon {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// AmazonPage oldpage = new AmazonPage();
		// oldpage.instock = true;
		// oldpage.expectPirce = 120.1f;
		// oldpage.price = 131.123f;
		//
		// AmazonPage page = new AmazonPage();
		// page.instock = true;
		// page.expectPirce = 130.122f;
		// page.price = 131.113f;
		//
		// if (page.instock) {
		// if (!oldpage.instock && page.expectPirce >= page.price) {
		// System.out.println("meet stock!");
		// } else {
		// if (oldpage.price > page.price
		// && page.expectPirce >= page.price)
		// System.out.println("meet price!");
		//
		// }
		// }

		int slist[] = { 6661, 1809, 6691, 2199, 8396, -1, 8738, 2199, 8850, -1,
				8858, 2199, 8885, -1, 8894, 2199, 9550, 2164, 9568, 2199, 9782,
				2188, 10564, 1866, 10572, 1861, 10618, 1836, 10638, 1878,
				10651, 1836, 10811, 1853, 10824, 1836, 10860, 1863, 10870,
				1836, 10905, 1825, 10916, 1848, 10925, 1872, 11050, 1861,
				11056, 1872, 11083, 1892, 11093, 1886, 11119, 1885, 11140,
				1884, 11166, 1882, 11188, 1872, 11195, 2199, 11198, 1872,
				11240, 1867, 11444, 1815, 11539, 1865, 11783, 1839, 11820,
				1837, 11828, 1865, 11944, 1874, 11969, 1865, 11993, 1876,
				12094, 1869, 12198, 1876, 12215, 1872, 12222, 1861, 12264,
				1872, 12310, 1861, 12404, 1872, 12417, 1861, 12430, 1826,
				12455, 1879, 12479, 1861, 12667, 1876, 12679, 1875, 12703,
				1861, 12766, 1872, 12862, 1882, 12874, 1879, 12893, 1873,
				12921, 1872, 12959, 1876, 13042, 1866, 13090, 1876, 13099,
				1880, 13108, 1885, 13179, 1876, 13337, 1865, 13393, 1908,
				13417, 1865, 13551, 1876, 13555, 1915, 13588, 1911, 13614,
				1876, 13627, 1932, 13659, 1931, 13684, 1930, 13708, 1931,
				13728, 1927, 13732, 1920, 13756, 1919, 13780, 1918, 13803,
				1929, 13828, 1930, 13861, 1797, 14478, 1955, 14495, 1952,
				14497, 2199, 15287, 1999, 15415, 2199, 16117, 2099, 16188,
				1309, 16300, 1302, 16305, 1917, 16369, 1934, 16440, 2199,
				16553, 2150, 16578, 2199, 16609, 2168, 16613, 1944, 16614,
				2168, 16625, 2137, 16638, 2106, 16640, 2075, 16663, 2043,
				16686, 1802, 16710, 2011, 16712, 1966, 16719, 1976, 16721,
				1966, 16750, 1976, 16752, 1966, 16760, 1802, 16772, 1779,
				16788, 1768, 16792, 1733, 16798, 1732, 16803, 1697, 16810,
				1735, 16837, 1736, 16843, 2042, 16864, 1999, 17062, 1976,
				17083, 1999, 17087, 1973, 17089, 1964, 17093, 1999, 17161,
				2083, 17165, 2098, 17179, 2114, 17181, 2083, 17193, 2017,
				17209, 1994, 17212, 1899, 17228, 1827, 17231, 1899, 17257,
				1424, 17304, 1282, 17553, 1994, 17561, 2017, 17563, 1994,
				17569, 1985, 17571, 1805, 17595, 1994, 17597, 1985, 17598,
				1994, 17602, 2017, 17627, 2026, 17650, 2134, 17762, 1823,
				17777, 1842, 17796, 1878, 17803, 2026, 17805, 2016, 17918,
				1926, 17924, 2016, 17932, 2033, 17938, 2050, 17944, 2067,
				17952, 2085, 17970, 2103, 18000, 2121, 18026, 2133, 18061,
				2098, 18163, 1994, 18165, 1978, 18211, 1589, 18316, 1289,
				18451, 1989, 18491, 1916, 18510, 1978, 18514, 1994, 18531,
				2026, 18539, 1994, 18545, 2026, 18564, 2017, 18568, 2026,
				18581, 2017, 18587, 2026, 18604, 2017, 18615, 2026, 18635,
				2017, 18788, 2026, 18835, 2017, 18855, 2026, 18859, 2017,
				18875, 2026, 18878, 2017, 18904, 2026, 18908, 2017, 19295,
				2019, 19319, 2016, 19437, 2019, 19485, 2016, 19511, 1981,
				19784, 2018, 19826, 2019, 19849, 1981, 19941, 1926, 20052,
				1916, 20112, 1926, 20152, 1916, 20209, 1926, 20215, 1916,
				20264, 1899, 20311, 1916, 20428, 1799, 20493, 1798, 20516,
				1618, 20541, 1456, 20564, 1799, 21170, 1833, 21375, 1859,
				21441, 1863, 21456, 1833, 21493, 1799, 21752, 1798, 21794,
				1782, 21802, 1845, 21826, 1780, 21852, 1898, 21874, 1771,
				21898, 1774, 21923, 1773, 21948, 1774, 22019, 1773, 22131,
				1764, 22256, 1699, 22297, 1799, 22348, 1667, 22435, 1799,
				22516, 1734, 22537, 1685, 22590, 1799, 22936, 1777, 23042,
				1716, 23098, 1777, 23166, 1792, 23216, 1799, 23291, 1777,
				23334, 1799, 23363, 1777, 23450, 1799, 23894, 1760, 23913,
				1731, 23939, 1700, 23961, 1689, 23985, 1680, 24008, 1674,
				24033, 1669, 24073, 1665, 24089, 1658, 24114, 1640, 24137,
				1625, 24162, 1612, 24186, 1687, 24188, 1709, 24222, 1731,
				24257, 1753, 24289, 1782, 24300, 1799 };
		int befores = 0;
		for (int i = 0; i < slist.length; i++) {
			if (i % 2 == 0) {
				int s = slist[i];
				if (i != 0)
					befores = slist[i - 2];
				System.out.print(s + "-");
				System.out.print(befores + "=");
				System.out.println(s - befores);
			}
		}

		GregorianCalendar calendar = new GregorianCalendar();
		calendar.clear();
		calendar.set(Calendar.YEAR, 2013);
		calendar.set(Calendar.MONTH, 9);
		calendar.set(Calendar.DAY_OF_MONTH, 9);
		calendar.set(Calendar.HOUR,3);
		calendar.set(Calendar.MINUTE,20);
		
		System.out.println(calendar.getTime());
		long c1=calendar.getTimeInMillis();
		System.out.println(calendar.getTimeInMillis());

		calendar.clear();
		calendar.set(Calendar.YEAR, 2013);
		calendar.set(Calendar.MONTH, 10);
		calendar.set(Calendar.DAY_OF_MONTH, 9);
		calendar.set(Calendar.HOUR,13);
		calendar.set(Calendar.MINUTE,26);
		
		System.out.println(calendar.getTime());
		long c2=calendar.getTimeInMillis();

		System.out.println(calendar.getTimeInMillis());
		System.out.println(c2-c1);
		Date d=getDateBefore(calendar.getTime(),761);
		System.out.println(d);

	}

	public static Date getDateBefore(Date d, int day) {
		Calendar now = Calendar.getInstance();
		now.setTime(d);
		now.set(Calendar.DATE, now.get(Calendar.DATE) - day);
		return now.getTime();
	}
}
