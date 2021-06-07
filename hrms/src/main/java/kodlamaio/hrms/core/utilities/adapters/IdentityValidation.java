package kodlamaio.hrms.core.utilities.adapters;

import kodlamaio.hrms.fakeMernis.FakeMernis;

public class IdentityValidation {
	public static boolean isRealPerson(String tcno) {

		FakeMernis fakeMernis = new FakeMernis();
		return FakeMernis.Validation(tcno);
}
}
