package ticketmodeling.domain.audience.identify;

import java.security.cert.Certificate;

public class SeniorIdentify extends CertificateAudienceIdentify<SeniorIdentify>
{
	public SeniorIdentify(Certificate certificate) {
		super(certificate);
	}
}