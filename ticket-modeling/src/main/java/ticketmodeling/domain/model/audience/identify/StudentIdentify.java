package ticketmodeling.domain.model.audience.identify;

import java.security.cert.Certificate;

public class StudentIdentify extends CertificateAudienceIdentify<StudentIdentify>
{
	public StudentIdentify(final Certificate certificate) {
		super(certificate);
	}
}
