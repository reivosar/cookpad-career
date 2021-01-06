package ticketmodeling.domain.model.audience.identify;

import java.security.cert.Certificate;

public class CinemaCitizenIdentify extends CertificateAudienceIdentify<CinemaCitizenIdentify>
{
	public CinemaCitizenIdentify(final Certificate certificate) {
		super(certificate);
	}
}
