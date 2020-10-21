package ticketmodeling.domain.model.audience.identify;

import java.security.cert.Certificate;

public class StudentIdentify extends CertificateAudienceIdentify<StudentIdentify>
{
	public StudentIdentify(Certificate certificate) {
		super(certificate);
	}
}
