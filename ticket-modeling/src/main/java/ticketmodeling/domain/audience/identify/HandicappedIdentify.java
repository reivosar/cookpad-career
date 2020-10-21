package ticketmodeling.domain.audience.identify;

import java.security.cert.Certificate;

public class HandicappedIdentify extends CertificateAudienceIdentify<HandicappedIdentify>
{
	public HandicappedIdentify(Certificate certificate) {
		super(certificate);
	}
}
