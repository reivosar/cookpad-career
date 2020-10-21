package ticketmodeling.domain.audience.identify;

import java.security.cert.Certificate;

import ticketmodeling.common.domain.shared.ValueObject;
import ticketmodeling.domain.audience.AudienceId;

abstract class CertificateAudienceIdentify<T extends CertificateAudienceIdentify<T>>
	extends ValueObject<T>
	implements AudienceIdentify
{
	protected final Certificate certificate;

	public CertificateAudienceIdentify(Certificate certificate) {
		this.certificate = certificate;
	}

	@Override
	public AudienceId getId() {
		return AudienceId.genereteId();
	}

	@Override
	public void verify() {
		try {
			this.certificate.verify(this.certificate.getPublicKey());
		} catch (Exception e) {
			throw new AudienceIdentifyException("This certificate is not available.", e);
		}
	}
}
