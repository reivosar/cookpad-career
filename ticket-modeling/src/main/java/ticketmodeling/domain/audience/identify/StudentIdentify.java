package ticketmodeling.domain.audience.identify;

import java.security.cert.Certificate;

public class StudentIdentify extends CertificateAudienceIdentify<StudentIdentify>
{
	public StudentIdentify(Certificate certificate) {
		super(certificate);
	}
}
