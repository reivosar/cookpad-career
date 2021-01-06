package ticketmodeling.domain.model.audience.identify;

import java.security.cert.Certificate;

public class SeniorIdentify extends CertificateAudienceIdentify<SeniorIdentify>
{
	public SeniorIdentify(final Certificate certificate) {
		super(certificate);
	}
}