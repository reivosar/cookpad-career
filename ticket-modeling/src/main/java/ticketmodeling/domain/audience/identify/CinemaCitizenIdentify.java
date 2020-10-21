package ticketmodeling.domain.audience.identify;

import java.security.cert.Certificate;

public class CinemaCitizenIdentify extends CertificateAudienceIdentify<CinemaCitizenIdentify>
{
	public CinemaCitizenIdentify(Certificate certificate) {
		super(certificate);
	}
}
