package ticketmodeling.domain.audience.identify;

import java.security.cert.Certificate;

public class UniversityIdentify extends CertificateAudienceIdentify<UniversityIdentify>
{
	public UniversityIdentify(Certificate certificate) {
		super(certificate);
	}
}
