package ticketmodeling.domain.model.audience.identify;

import java.security.cert.Certificate;

public class SeniorCinemaCitizenIdentify extends CertificateAudienceIdentify<SeniorCinemaCitizenIdentify>
{
	public SeniorCinemaCitizenIdentify(Certificate certificate) {
		super(certificate);
	}
}
